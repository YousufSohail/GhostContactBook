package com.yousufsohail.ghostcontactbook.dal;

import com.yousufsohail.ghostcontactbook.network.User;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by saif-ul-malook on 18-Jan-17.
 */

@Entity
public class UserBean {

    @Id
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String first;

    @NotNull
    private String last;

    @NotNull
    private String email;

    @NotNull
    private String dob;

    @NotNull
    private String phone;

    @NotNull
    private String cell;

    @NotNull
    private String thumbnailPic;

    @NotNull
    private String mediumPic;

    @NotNull
    private String largePic;


    @Generated(hash = 1203313951)
    public UserBean() {
    }

    @Generated(hash = 1358414156)
    public UserBean(Long id, @NotNull String title, @NotNull String first,
                    @NotNull String last, @NotNull String email, @NotNull String dob,
                    @NotNull String phone, @NotNull String cell, @NotNull String thumbnailPic,
                    @NotNull String mediumPic, @NotNull String largePic) {
        this.id = id;
        this.title = title;
        this.first = first;
        this.last = last;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.cell = cell;
        this.thumbnailPic = thumbnailPic;
        this.mediumPic = mediumPic;
        this.largePic = largePic;
    }

    public UserBean(User user) {
        this.first = user.getName().first;
        this.cell = user.getCell();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return this.cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getThumbnailPic() {
        return this.thumbnailPic;
    }

    public void setThumbnailPic(String thumbnailPic) {
        this.thumbnailPic = thumbnailPic;
    }

    public String getMediumPic() {
        return this.mediumPic;
    }

    public void setMediumPic(String mediumPic) {
        this.mediumPic = mediumPic;
    }

    public String getLargePic() {
        return this.largePic;
    }

    public void setLargePic(String largePic) {
        this.largePic = largePic;
    }

}
