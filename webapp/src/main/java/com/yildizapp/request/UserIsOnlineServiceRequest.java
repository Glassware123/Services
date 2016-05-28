package com.yildizapp.request;

/**
 * Created by ubuntu on 09.05.2016.
 */
public class UserIsOnlineServiceRequest {
    public Integer id;
    public boolean isOnlineStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getIsOnlineStatus() {
        return isOnlineStatus;
    }

    public void setIsOnlineStatus(boolean isOnlineStatus) {
        this.isOnlineStatus = isOnlineStatus;
    }
}
