/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Doctor_ implements Serializable {

    private static final long serialVersionUID = -1699308132;

    private Long   id;
    private Long   addressFk;
    private Long   medicalCenterFk;
    private String doctorName;
    private Long   contactFk;
    private Long   phone;
    private String experience;
    private String email;
    private String comment;

    public Doctor_() {}

    public Doctor_(Doctor_ value) {
        this.id = value.id;
        this.addressFk = value.addressFk;
        this.medicalCenterFk = value.medicalCenterFk;
        this.doctorName = value.doctorName;
        this.contactFk = value.contactFk;
        this.phone = value.phone;
        this.experience = value.experience;
        this.email = value.email;
        this.comment = value.comment;
    }

    public Doctor_(
        Long   id,
        Long   addressFk,
        Long   medicalCenterFk,
        String doctorName,
        Long   contactFk,
        Long   phone,
        String experience,
        String email,
        String comment
    ) {
        this.id = id;
        this.addressFk = addressFk;
        this.medicalCenterFk = medicalCenterFk;
        this.doctorName = doctorName;
        this.contactFk = contactFk;
        this.phone = phone;
        this.experience = experience;
        this.email = email;
        this.comment = comment;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public Long getAddressFk() {
        return this.addressFk;
    }

    public void setAddressFk(Long addressFk) {
        this.addressFk = addressFk;
    }

    public Long getMedicalCenterFk() {
        return this.medicalCenterFk;
    }

    public void setMedicalCenterFk(Long medicalCenterFk) {
        this.medicalCenterFk = medicalCenterFk;
    }

    @Size(max = 100)
    public String getDoctorName() {
        return this.doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Long getContactFk() {
        return this.contactFk;
    }

    public void setContactFk(Long contactFk) {
        this.contactFk = contactFk;
    }

    public Long getPhone() {
        return this.phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Size(max = 100)
    public String getExperience() {
        return this.experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Size(max = 100)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Size(max = 100)
    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Doctor_ (");

        sb.append(id);
        sb.append(", ").append(addressFk);
        sb.append(", ").append(medicalCenterFk);
        sb.append(", ").append(doctorName);
        sb.append(", ").append(contactFk);
        sb.append(", ").append(phone);
        sb.append(", ").append(experience);
        sb.append(", ").append(email);
        sb.append(", ").append(comment);

        sb.append(")");
        return sb.toString();
    }
}
