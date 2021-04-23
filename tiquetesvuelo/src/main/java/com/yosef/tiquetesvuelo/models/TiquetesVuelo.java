package com.yosef.tiquetesvuelo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tiquetesVuelo")
public class TiquetesVuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

//	@Column(nullable = false)
//	private Date fechaSalida;
//
//	@Column(nullable = false)
//	private Date fechaLLegada;

//	@Column(nullable = false)
//	private String ciudadOrigen;

	@Column(nullable = false)
	private String ciudadDestino;

	@Column(nullable = false)
	private String nombrePasajero;

//	@Column(nullable = false)
//	private int edadPasajero;
//
//	@Column(nullable = false)
//	private Boolean tieneBodegaEquipaje;

	@Column(nullable = false)
	private Double price;

//	@Column(nullable = false)
//	private LocalTime horaSalida;
//
//	@Column(nullable = false)
//	private LocalTime horaLlegada;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public Date getFechaSalida() {
//		return fechaSalida;
//	}
//
//	public void setFechaSalida(Date fechaSalida) {
//		this.fechaSalida = fechaSalida;
//	}
//
//	public Date getFechaLLegada() {
//		return fechaLLegada;
//	}
//
//	public void setFechaLLegada(Date fechaLLegada) {
//		this.fechaLLegada = fechaLLegada;
//	}

//	public String getCiudadOrigen() {
//		return ciudadOrigen;
//	}
//
//	public void setCiudadOrigen(String ciudadOrigen) {
//		this.ciudadOrigen = ciudadOrigen;
//	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public String getNombrePasajero() {
		return nombrePasajero;
	}

	public void setNombrePasajero(String nombrePasajero) {
		this.nombrePasajero = nombrePasajero;
	}

//	public int getEdadPasajero() {
//		return edadPasajero;
//	}
//
//	public void setEdadPasajero(int edadPasajero) {
//		this.edadPasajero = edadPasajero;
//	}

//	public Boolean getTieneBodegaEquipaje() {
//		return tieneBodegaEquipaje;
//	}
//
//	public void setTieneBodegaEquipaje(Boolean tieneBodegaEquipaje) {
//		this.tieneBodegaEquipaje = tieneBodegaEquipaje;
//	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

//	public LocalTime getHoraSalida() {
//		return horaSalida;
//	}
//
//	public void setHoraSalida(LocalTime horaSalida) {
//		this.horaSalida = horaSalida;
//	}
//
//	public LocalTime getHoraLlegada() {
//		return horaLlegada;
//	}
//
//	public void setHoraLlegada(LocalTime horaLlegada) {
//		this.horaLlegada = horaLlegada;
//	}
}
