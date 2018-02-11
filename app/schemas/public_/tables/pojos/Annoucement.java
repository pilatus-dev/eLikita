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
public class Annoucement implements Serializable {

    private static final long serialVersionUID = 498047093;

    private Long   id;
    private String message;
    private String title;

    public Annoucement() {}

    public Annoucement(Annoucement value) {
        this.id = value.id;
        this.message = value.message;
        this.title = value.title;
    }

    public Annoucement(
        Long   id,
        String message,
        String title
    ) {
        this.id = id;
        this.message = message;
        this.title = title;
    }

    @NotNull
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Size(max = 255)
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Size(max = 255)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Annoucement (");

        sb.append(id);
        sb.append(", ").append(message);
        sb.append(", ").append(title);

        sb.append(")");
        return sb.toString();
    }
}