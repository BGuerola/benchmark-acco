package com.justaproject.manco.model;

//import java.beans.JavaBean;

import javax.persistence.Entity;

//@JavaBean
public class Resultat {
	
	int cifranegociomediadelsector;
	int margenbruto;
	double margenBrutoenporc;
	int comprasdebienesyservicios;
	int gastospersonal;
	int cifradenegocioporpersonaocupada;
	int productividadporpersonaocupada;
	int gastosdepersonalporpersonaocupada;
	double compradebienesyserviciosCifradenegocio;
	double gastospersonalsobreproductividadporc;
	double mediadepersonasocupadasporempresa;
	double CuotaMercado; 
	
	public Resultat(int cifranegociomediadelsector, int margenbruto, double margenBrutoenporc,
			int comprasdebienesyservicios, int gastospersonal, int cifradenegocioporpersonaocupada,
			int productividadporpersonaocupada, int gastosdepersonalporpersonaocupada,
			double compradebienesyserviciosCifradenegocio, double gastospersonalsobreproductividadporc,
			double mediadepersonasocupadasporempresa,double CuotaMercado) {
		super();
		this.cifranegociomediadelsector = cifranegociomediadelsector;
		this.margenbruto = margenbruto;
		this.margenBrutoenporc = margenBrutoenporc;
		this.comprasdebienesyservicios = comprasdebienesyservicios;
		this.gastospersonal = gastospersonal;
		this.cifradenegocioporpersonaocupada = cifradenegocioporpersonaocupada;
		this.productividadporpersonaocupada = productividadporpersonaocupada;
		this.gastosdepersonalporpersonaocupada = gastosdepersonalporpersonaocupada;
		this.compradebienesyserviciosCifradenegocio = compradebienesyserviciosCifradenegocio;
		this.gastospersonalsobreproductividadporc = gastospersonalsobreproductividadporc;
		this.mediadepersonasocupadasporempresa = mediadepersonasocupadasporempresa;
		this.CuotaMercado = CuotaMercado;
	}
	public int getCifranegociomediadelsector() {
		return cifranegociomediadelsector;
	}
	public void setCifranegociomediadelsector(int cifranegociomediadelsector) {
		this.cifranegociomediadelsector = cifranegociomediadelsector;
	}
	public int getMargenbruto() {
		return margenbruto;
	}
	public void setMargenbruto(int margenbruto) {
		this.margenbruto = margenbruto;
	}
	public double getMargenBrutoenporc() {
		return margenBrutoenporc;
	}
	public void setMargenBrutoenporc(int margenBrutoenporc) {
		this.margenBrutoenporc = margenBrutoenporc;
	}
	public int getComprasdebienesyservicios() {
		return comprasdebienesyservicios;
	}
	public void setComprasdebienesyservicios(int comprasdebienesyservicios) {
		this.comprasdebienesyservicios = comprasdebienesyservicios;
	}
	public int getGastospersonal() {
		return gastospersonal;
	}
	public void setGastospersonal(int gastospersonal) {
		this.gastospersonal = gastospersonal;
	}
	public int getCifradenegocioporpersonaocupada() {
		return cifradenegocioporpersonaocupada;
	}
	public void setCifradenegocioporpersonaocupada(int cifradenegocioporpersonaocupada) {
		this.cifradenegocioporpersonaocupada = cifradenegocioporpersonaocupada;
	}
	public int getProductividadporpersonaocupada() {
		return productividadporpersonaocupada;
	}
	public void setProductividadporpersonaocupada(int productividadporpersonaocupada) {
		this.productividadporpersonaocupada = productividadporpersonaocupada;
	}
	public int getGastosdepersonalporpersonaocupada() {
		return gastosdepersonalporpersonaocupada;
	}
	public void setGastosdepersonalporpersonaocupada(int gastosdepersonalporpersonaocupada) {
		this.gastosdepersonalporpersonaocupada = gastosdepersonalporpersonaocupada;
	}
	public double getCompradebienesyserviciosCifradenegocio() {
		return compradebienesyserviciosCifradenegocio;
	}
	public void setCompradebienesyserviciosCifradenegocio(int compradebienesyserviciosCifradenegocio) {
		this.compradebienesyserviciosCifradenegocio = compradebienesyserviciosCifradenegocio;
	}
	public double getGastospersonalsobreproductividadporc() {
		return gastospersonalsobreproductividadporc;
	}
	public void setGastospersonalsobreproductividadporc(int gastospersonalsobreproductividadporc) {
		this.gastospersonalsobreproductividadporc = gastospersonalsobreproductividadporc;
	}
	public double getMediadepersonasocupadasporempresa() {
		return mediadepersonasocupadasporempresa;
	}
	public void setMediadepersonasocupadasporempresa(int mediadepersonasocupadasporempresa) {
		this.mediadepersonasocupadasporempresa = mediadepersonasocupadasporempresa;
	}
	
	
	public double getCuotaMercado() {
		return CuotaMercado;
	}
	public void setCuotaMercado(double cuotaMercado) {
		CuotaMercado = cuotaMercado;
	}
	public void setMargenBrutoenporc(double margenBrutoenporc) {
		this.margenBrutoenporc = margenBrutoenporc;
	}
	public void setCompradebienesyserviciosCifradenegocio(double compradebienesyserviciosCifradenegocio) {
		this.compradebienesyserviciosCifradenegocio = compradebienesyserviciosCifradenegocio;
	}
	public void setGastospersonalsobreproductividadporc(double gastospersonalsobreproductividadporc) {
		this.gastospersonalsobreproductividadporc = gastospersonalsobreproductividadporc;
	}
	public void setMediadepersonasocupadasporempresa(double mediadepersonasocupadasporempresa) {
		this.mediadepersonasocupadasporempresa = mediadepersonasocupadasporempresa;
	}
	@Override
	public String toString() {
		return "Resultat [cifranegociomediadelsector=" + cifranegociomediadelsector + ", margenbruto=" + margenbruto
				+ ", margenBrutoenporc=" + margenBrutoenporc + ", comprasdebienesyservicios="
				+ comprasdebienesyservicios + ", gastospersonal=" + gastospersonal
				+ ", cifradenegocioporpersonaocupada=" + cifradenegocioporpersonaocupada
				+ ", productividadporpersonaocupada=" + productividadporpersonaocupada
				+ ", gastosdepersonalporpersonaocupada=" + gastosdepersonalporpersonaocupada
				+ ", compradebienesyserviciosCifradenegocio=" + compradebienesyserviciosCifradenegocio
				+ ", gastospersonalsobreproductividadporc=" + gastospersonalsobreproductividadporc
				+ ", mediadepersonasocupadasporempresa=" + mediadepersonasocupadasporempresa + "]";
	}

	
	

}
