package com.newBlog.pojo;

public class User {
	//用户id
    private Integer userId;
    //用户组id
    private Integer groupId;
    //用户名
    private String userName;
    //密码
    private String userPwd;
    //手机号
    private Integer userPhone;
    //性别
    private String userSex;
    //qq
    private Integer userQq;
    //email
    private String userEmail;
    //地址
    private String userAddress;
    //上次登录ip
    private String userLastLoginIp;
    //生日
    private Integer userBirthday;
    //自我描述
    private String userDescription;
    //头像路径
    private String userImageUrl;
    //注册时间
    private Integer userRegisterTime;
    //注册的ip地址
    private String userRegisterIp;
    //上次更新博客时间
    private Integer userLastUpdateTime;
    //微博
    private String userWeibo;
    //语录
    private String userSays;
    //是否锁定 0为锁定 1为不锁定
    private Byte userLock;
    //是否冻结 0为部冻结，1为冻结
    private Byte userFreeze;
    //拥有权限
    private String userPower;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Integer getUserQq() {
        return userQq;
    }

    public void setUserQq(Integer userQq) {
        this.userQq = userQq;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserLastLoginIp() {
        return userLastLoginIp;
    }

    public void setUserLastLoginIp(String userLastLoginIp) {
        this.userLastLoginIp = userLastLoginIp == null ? null : userLastLoginIp.trim();
    }

    public Integer getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Integer userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription == null ? null : userDescription.trim();
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl == null ? null : userImageUrl.trim();
    }

    public Integer getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(Integer userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public String getUserRegisterIp() {
        return userRegisterIp;
    }

    public void setUserRegisterIp(String userRegisterIp) {
        this.userRegisterIp = userRegisterIp == null ? null : userRegisterIp.trim();
    }

    public Integer getUserLastUpdateTime() {
        return userLastUpdateTime;
    }

    public void setUserLastUpdateTime(Integer userLastUpdateTime) {
        this.userLastUpdateTime = userLastUpdateTime;
    }

    public String getUserWeibo() {
        return userWeibo;
    }

    public void setUserWeibo(String userWeibo) {
        this.userWeibo = userWeibo == null ? null : userWeibo.trim();
    }

    public String getUserSays() {
        return userSays;
    }

    public void setUserSays(String userSays) {
        this.userSays = userSays == null ? null : userSays.trim();
    }

    public Byte getUserLock() {
        return userLock;
    }

    public void setUserLock(Byte userLock) {
        this.userLock = userLock;
    }

    public Byte getUserFreeze() {
        return userFreeze;
    }

    public void setUserFreeze(Byte userFreeze) {
        this.userFreeze = userFreeze;
    }

    public String getUserPower() {
        return userPower;
    }

    public void setUserPower(String userPower) {
        this.userPower = userPower == null ? null : userPower.trim();
    }

	@Override
	public String toString() {
		return "User [userId=" + userId + ", groupId=" + groupId + ", userName=" + userName + ", userPwd=" + userPwd
				+ ", userPhone=" + userPhone + ", userSex=" + userSex + ", userQq=" + userQq + ", userEmail="
				+ userEmail + ", userAddress=" + userAddress + ", userLastLoginIp=" + userLastLoginIp
				+ ", userBirthday=" + userBirthday + ", userDescription=" + userDescription + ", userImageUrl="
				+ userImageUrl + ", userRegisterTime=" + userRegisterTime + ", userRegisterIp=" + userRegisterIp
				+ ", userLastUpdateTime=" + userLastUpdateTime + ", userWeibo=" + userWeibo + ", userSays=" + userSays
				+ ", userLock=" + userLock + ", userFreeze=" + userFreeze + ", userPower=" + userPower + "]";
	}
    
}