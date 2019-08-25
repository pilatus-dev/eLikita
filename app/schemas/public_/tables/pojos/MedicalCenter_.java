/*
 * This file is generated by jOOQ.
*/
package schemas.public_.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
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
public class MedicalCenter_ implements Serializable {

    private static final long serialVersionUID = 161284388;

    private Long   id;
    private Long   addressFk;
    private String tel_1;
    private String tel_2;
    private String medicalCenterName;

    public MedicalCenter_() {}

    public MedicalCenter_(MedicalCenter_ value) {
        this.id = value.id;
        this.addressFk = value.addressFk;
        this.tel_1 = value.tel_1;
        this.tel_2 = value.tel_2;
        this.medicalCenterName = value.medicalCenterName;
    }

    public MedicalCenter_(
        Long   id,
        Long   addressFk,
        String tel_1,
        String tel_2,
        String medicalCenterName
    ) {
        this.id = id;
        this.addressFk = addressFk;
        this.tel_1 = tel_1;
        this.tel_2 = tel_2;
        this.medicalCenterName = medicalCenterName;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAddressFk() {
        return this.addressFk;
    }

    public void setAddressFk(Long addressFk) {
        this.addressFk = addressFk;
    }

    @Size(max = 50)
    public String getTel_1() {
        return this.tel_1;
    }

    public void setTel_1(String tel_1) {
        this.tel_1 = tel_1;
    }

    @Size(max = 50)
    public String getTel_2() {
        return this.tel_2;
    }

    public void setTel_2(String tel_2) {
        this.tel_2 = tel_2;
    }

    @Size(max = 100)
    public String getMedicalCenterName() {
        return this.medicalCenterName;
    }

    public void setMedicalCenterName(String medicalCenterName) {
        this.medicalCenterName = medicalCenterName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MedicalCenter_ (");

        sb.append(id);
        sb.append(", ").append(addressFk);
        sb.append(", ").append(tel_1);
        sb.append(", ").append(tel_2);
        sb.append(", ").append(medicalCenterName);

        sb.append(")");
        return sb.toString();
    }
}
