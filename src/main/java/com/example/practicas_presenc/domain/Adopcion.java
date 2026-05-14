package com.example.practicas_presenc.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "adopcion")

public class Adopcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_adoptante")
    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100)
    private String nombreAdoptante;

    @Column
    @NotBlank(message = "El teléfono es obligatorio")
    @Size(max = 20)
    private String telefono;

    @Column
    @NotBlank (message = "El campo no puede estar vacío")
    @Email(message = "El mail no tiene un formato válido")
    @Size(max = 100)
    private String email;

    @Column(name = "fecha_solicitud")
    @NotNull(message = "La fecha de solicitud es obligatoria")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaSolicitud;

    @Column
    @NotNull(message = "El campo es obligatorio")
    private Boolean aprobada;

    @Column(name = "fecha_adopcion")
    @NotNull(message = "La fecha de adopción es obligatoria")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaAdopcion;

}
