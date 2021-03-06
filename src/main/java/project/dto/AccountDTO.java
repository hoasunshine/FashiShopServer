package project.dto;

import project.model.Accounts;
import project.model.Roles;
import project.util.DateTimeUtil;
import project.util.ObjectUtil;

import java.util.List;

public class AccountDTO {
    private int AccountId;
    private String AccountName;
    private String PhoneNumber;
    private String Email;
    private String Address;
    private long CreatedAt;
    private long UpdatedAt;
    private long DeletedAt;
    private Accounts.Gender Gender;
    private String Birthday;
    private Accounts.AccountStatus Status;
    private String Password;
    private String Token;
    private List<Roles> rolesList;

    public AccountDTO() {
    }

    public AccountDTO(Accounts accounts) {
        AccountId = accounts.getAccountId();
        AccountName = accounts.getAccountName();
        PhoneNumber = accounts.getPhoneNumber();
        Email = accounts.getEmail();
        Address = accounts.getAddress();
        CreatedAt = accounts.getCreatedAt();
        UpdatedAt = accounts.getUpdatedAt();
        DeletedAt = accounts.getDeletedAt();
        Gender = accounts.getGender();
        Birthday = accounts.getBirthday();
        Status = accounts.getStatus();
        Password = accounts.getPassword();
        Token = accounts.getToken();
        rolesList = accounts.getRolesList();
    }

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int accountId) {
        AccountId = accountId;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Accounts.Gender getGender() {
        return Gender;
    }

    public void setGender(Accounts.Gender gender) {
        Gender = gender;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public Accounts.AccountStatus getStatus() {
        return Status;
    }

    public void setStatus(Accounts.AccountStatus status) {
        Status = status;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public List<Roles> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<Roles> rolesList) {
        this.rolesList = rolesList;
    }

    public long getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(long createdAt) {
        CreatedAt = createdAt;
    }

    public long getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        UpdatedAt = updatedAt;
    }

    public long getDeletedAt() {
        return DeletedAt;
    }

    public void setDeletedAt(long deletedAt) {
        DeletedAt = deletedAt;
    }
}
