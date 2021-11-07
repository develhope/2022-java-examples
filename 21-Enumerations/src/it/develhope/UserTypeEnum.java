package it.develhope;

public enum UserTypeEnum {
    MEGA_ADMIN(true, true,true), //0
    SUPER_ADMIN(true, true,true), //1
    ADMIN(true, true,true), //2
    EDITOR(false, true, true), //3
    LOGGED(false, false, true), //4
    GUEST(false, false, false) //5
    ;

    final public boolean canAdminUsers;
    final public boolean canWritePosts;
    final public boolean canSeePosts;

    UserTypeEnum(boolean canAdminUsers, boolean canWritePosts, boolean canSeePosts){
        this.canAdminUsers = canAdminUsers;
        this.canWritePosts = canWritePosts;
        this.canSeePosts =canSeePosts;
    }

    public boolean isAdmin(){
        return this.ordinal() < 3;
    }

    @Override
    public String toString() {
        return "UserTypeEnum{" +
                "name=" + this.name() +
                ", ordinal=" + this.ordinal() +
                ", canAdminUsers=" + canAdminUsers +
                ", canWritePosts=" + canWritePosts +
                ", canSeePosts=" + canSeePosts +
                '}';
    }
}
