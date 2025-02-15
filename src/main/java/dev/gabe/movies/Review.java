package dev.gabe.movies;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String body;

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }


    public ObjectId getId() {
        return id;
    }

    public String getBody() {
        return body;
    }


    public Review(String body) {
        this.body = body;
    }
}
