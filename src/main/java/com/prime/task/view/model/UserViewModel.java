package com.prime.task.view.model;

import com.prime.task.utils.UserStatus;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserViewModel {

    public Long id;

    @NotNull
    @NotEmpty
    @Size(max = 20)
    public String fullname;

    @NotNull
    @NotEmpty
    @Size(max = 10)
    public String login;

    @NotNull
    public UserStatus status;

    public UserViewModel(Long id, String fullname, String login, UserStatus status) {
        this.id = id;
        this.fullname = fullname;
        this.login = login;
        this.status = status;
    }
}
