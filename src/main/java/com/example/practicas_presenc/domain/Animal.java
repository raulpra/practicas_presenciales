package com.example.practicas_presenc.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "animal")

public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100)
    private String nombre;

    @Column
    @NotBlank(message = "La especie es obligatoria")
    @Size(max = 100)
    private String especie;

    @Column
    @NotBlank(message = "La raza es obligatoria")
    @Size(max = 100)
    private String raza;

    @Column(nullable = false)
    @NotNull (message = "Introduzca un dato válido")
    private int edad;

    @Column(name = "fecha_ingreso")
    @NotNull(message = "La fecha de ingreso es obligatoria")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaIngreso;

    @Column(nullable = false)
    @NotNull(message = "Debe indicar si esta adoptado")
    private boolean adoptado;

    @Column(nullable = false)
    @NotNull(message = "Debe indicar si esta vacunado")
    private boolean vacunado;

    @Column(name = "foto_url", nullable = false)
    private String fotoUrl;
}
