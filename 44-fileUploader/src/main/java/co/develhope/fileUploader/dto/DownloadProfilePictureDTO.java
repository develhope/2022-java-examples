package co.develhope.fileUploader.dto;

import co.develhope.fileUploader.entities.User;
import lombok.Data;

@Data
public class DownloadProfilePictureDTO {

    private User user;
    private byte[] profileImage;
}
