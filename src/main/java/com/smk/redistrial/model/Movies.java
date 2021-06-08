package com.smk.redistrial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movies")
public class Movies implements Serializable {

    private static final long serialVersionUID = 7156526077883281623L;

    @Id
    private int id;

    private String movieName;

    private int year;

}
