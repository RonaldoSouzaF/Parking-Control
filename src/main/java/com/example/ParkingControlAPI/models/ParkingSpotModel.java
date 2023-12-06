package com.example.ParkingControlAPI.models;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT")
@Data
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID= 1L;

    // uma entity precisa de um Identificador, dai o Id.
    //o tipo UUID de Id, é universal, mais complexo, e impossiblita riscos desnecessarios, tais como. confusão, ainda mais em arquitetura de microserviços

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    @Column(nullable = false, length = 70)
    private String brandCar;
    @Column(nullable = false, length = 70)
    private String modelCar;
    @Column(nullable = false, length = 70)
    private String colorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String responsibleName;
    @Column(nullable = false, length = 30)
    private String apartment;
    @Column(nullable = false, length = 30)
    private String block;

    //tradução das classes acima: numero da vaga,placa do carro, marca do carro, modelo do carro, cor do carro, data de registro, nome do responsavel,numero do apartamento, e o bloco do apartamento







}
