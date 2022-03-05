package co.develhope.fileUploader.services;

import co.develhope.fileUploader.dto.DownloadProfilePictureDTO;
import co.develhope.fileUploader.entities.User;
import co.develhope.fileUploader.repositories.UserRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FileStorageService fileStorageService;

    @SneakyThrows
    private User getUser(Long userId){
        Optional<User> optionalUser = userRepository.findById(userId);
        if(!optionalUser.isPresent()) throw new Exception("User is not present");
        return optionalUser.get();
    }

    @SneakyThrows
    public User uploadProfilePicture(Long userId, MultipartFile profilePicture) {
        User user = getUser(userId);
        if(user.getProfilePicture() != null){
            fileStorageService.remove(user.getProfilePicture());
        }
        String fileName = fileStorageService.upload(profilePicture);
        user.setProfilePicture(fileName);
        return userRepository.save(user);
    }

    @SneakyThrows
    public DownloadProfilePictureDTO downloadProfilePicture(Long userId) {
        User user = getUser(userId);

        DownloadProfilePictureDTO dto = new DownloadProfilePictureDTO();
        dto.setUser(user);

        if(user.getProfilePicture() == null) return dto;

        byte[] profilePictureBytes = fileStorageService.download(user.getProfilePicture());
        dto.setProfileImage(profilePictureBytes);
        return dto;
    }

    @SneakyThrows
    public void remove(Long userId) {
        User user = getUser(userId);
        if(user.getProfilePicture() != null) {
            fileStorageService.remove(user.getProfilePicture());
        }
        userRepository.deleteById(userId);
    }
}
