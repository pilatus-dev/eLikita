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
public class Nationality implements Serializable {

    private static final long serialVersionUID = 1761764190;

    private Long   id;
    private String countryBirth;
    private String nationality;
    private String secondNationality;
    private Long   studentFk;

    public Nationality() {}

    public Nationality(Nationality value) {
        this.id = value.id;
        this.countryBirth = value.countryBirth;
        this.nationality = value.nationality;
        this.secondNationality = value.secondNationality;
        this.studentFk = value.studentFk;
    }

    public Nationality(
        Long   id,
        String countryBirth,
        String nationality,
        String secondNationality,
        Long   studentFk
    ) {
        this.id = id;
        this.countryBirth = countryBirth;
        this.nationality = nationality;
        this.secondNationality = secondNationality;
        this.studentFk = studentFk;
    }

    @NotNull
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Size(max = 255)
    public String getCountryBirth() {
        return this.countryBirth;
    }

    public void setCountryBirth(String countryBirth) {
        this.countryBirth = countryBirth;
    }

    @Size(max = 255)
    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Size(max = 255)
    public String getSecondNationality() {
        return this.secondNationality;
    }

    public void setSecondNationality(String secondNationality) {
        this.secondNationality = secondNationality;
    }

    public Long getStudentFk() {
        return this.studentFk;
    }

    public void setStudentFk(Long studentFk) {
        this.studentFk = studentFk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Nationality (");

        sb.append(id);
        sb.append(", ").append(countryBirth);
        sb.append(", ").append(nationality);
        sb.append(", ").append(secondNationality);
        sb.append(", ").append(studentFk);

        sb.append(")");
        return sb.toString();
    }
}