package com.justaproject.manco.model;

import java.beans.JavaBean;

import javax.persistence.Entity;

@JavaBean
public class EmpresasCNAE {
	
	public String cnae;
	String cnae2019;
	int númerodeempresas;
	int cifradenegocios;
	int valordelaproducción;
	int valorañadidoacostedelosfactores;
	int excedentebrutodeexplotación;
	int totaldecomprasdebienesyservicios;
	int inversiónenactivosmateriales;
	int gastosdepersonal;
	int personalocupado;
	int personalremunerado;
	int personalremuneradoequivalenteatiempocompleto;
	int horastrabajadasporelpersonalremunerado;
	

	public EmpresasCNAE(String cnae, String cnae2019, int númerodeempresas, int cifradenegocios,
			int valordelaproducción, int valorañadidoacostedelosfactores, int excedentebrutodeexplotación,
			int totaldecomprasdebienesyservicios, int inversiónenactivosmateriales, int gastosdepersonal,
			int personalocupado, int personalremunerado, int personalremuneradoequivalenteatiempocompleto,
			int horastrabajadasporelpersonalremunerado) {
		this.cnae = cnae;
		this.cnae2019 = cnae2019;
		this.númerodeempresas = númerodeempresas;
		this.cifradenegocios = cifradenegocios;
		this.valordelaproducción = valordelaproducción;
		this.valorañadidoacostedelosfactores = valorañadidoacostedelosfactores;
		this.excedentebrutodeexplotación = excedentebrutodeexplotación;
		this.totaldecomprasdebienesyservicios = totaldecomprasdebienesyservicios;
		this.inversiónenactivosmateriales = inversiónenactivosmateriales;
		this.gastosdepersonal = gastosdepersonal;
		this.personalocupado = personalocupado;
		this.personalremunerado = personalremunerado;
		this.personalremuneradoequivalenteatiempocompleto = personalremuneradoequivalenteatiempocompleto;
		this.horastrabajadasporelpersonalremunerado = horastrabajadasporelpersonalremunerado;
	}

	public EmpresasCNAE() {
		// TODO Auto-generated constructor stub
	}

	public String getCnae() {
		return cnae;
	}

	public void setCnae(String cnae) {
		this.cnae = cnae;
	}

	public String getCnae2019() {
		return cnae2019;
	}

	public void setCnae2019(String cnae2019) {
		this.cnae2019 = cnae2019;
	}

	public int getNúmerodeempresas() {
		return númerodeempresas;
	}

	public void setNúmerodeempresas(int númerodeempresas) {
		this.númerodeempresas = númerodeempresas;
	}

	public int getCifradenegocios() {
		return cifradenegocios;
	}

	public void setCifradenegocios(int cifradenegocios) {
		this.cifradenegocios = cifradenegocios;
	}

	public int getValordelaproducción() {
		return valordelaproducción;
	}

	public void setValordelaproducción(int valordelaproducción) {
		this.valordelaproducción = valordelaproducción;
	}

	public int getValorañadidoacostedelosfactores() {
		return valorañadidoacostedelosfactores;
	}

	public void setValorañadidoacostedelosfactores(int valorañadidoacostedelosfactores) {
		this.valorañadidoacostedelosfactores = valorañadidoacostedelosfactores;
	}

	public int getExcedentebrutodeexplotación() {
		return excedentebrutodeexplotación;
	}

	public void setExcedentebrutodeexplotación(int excedentebrutodeexplotación) {
		this.excedentebrutodeexplotación = excedentebrutodeexplotación;
	}

	public int getTotaldecomprasdebienesyservicios() {
		return totaldecomprasdebienesyservicios;
	}

	public void setTotaldecomprasdebienesyservicios(int totaldecomprasdebienesyservicios) {
		this.totaldecomprasdebienesyservicios = totaldecomprasdebienesyservicios;
	}

	public int getInversiónenactivosmateriales() {
		return inversiónenactivosmateriales;
	}

	public void setInversiónenactivosmateriales(int inversiónenactivosmateriales) {
		this.inversiónenactivosmateriales = inversiónenactivosmateriales;
	}

	public int getGastosdepersonal() {
		return gastosdepersonal;
	}

	public void setGastosdepersonal(int gastosdepersonal) {
		this.gastosdepersonal = gastosdepersonal;
	}

	public int getPersonalocupado() {
		return personalocupado;
	}

	public void setPersonalocupado(int personalocupado) {
		this.personalocupado = personalocupado;
	}

	public int getPersonalremunerado() {
		return personalremunerado;
	}

	public void setPersonalremunerado(int personalremunerado) {
		this.personalremunerado = personalremunerado;
	}

	public int getPersonalremuneradoequivalenteatiempocompleto() {
		return personalremuneradoequivalenteatiempocompleto;
	}

	public void setPersonalremuneradoequivalenteatiempocompleto(int personalremuneradoequivalenteatiempocompleto) {
		this.personalremuneradoequivalenteatiempocompleto = personalremuneradoequivalenteatiempocompleto;
	}

	public int getHorastrabajadasporelpersonalremunerado() {
		return horastrabajadasporelpersonalremunerado;
	}

	public void setHorastrabajadasporelpersonalremunerado(int horastrabajadasporelpersonalremunerado) {
		this.horastrabajadasporelpersonalremunerado = horastrabajadasporelpersonalremunerado;
	}

	@Override
	public String toString() {
		return "EmpresasCNAE [cnae=" + cnae + ",/n cnae2019=" + cnae2019 + ",/n númerodeempresas=" + númerodeempresas
				+ ",/n cifradenegocios=" + cifradenegocios + ",/n valordelaproducción=" + valordelaproducción
				+ ",/n valorañadidoacostedelosfactores=" + valorañadidoacostedelosfactores
				+ ",/n excedentebrutodeexplotación=" + excedentebrutodeexplotación + ",/n totaldecomprasdebienesyservicios="
				+ totaldecomprasdebienesyservicios + ",/n inversiónenactivosmateriales=" + inversiónenactivosmateriales
				+ ",/n gastosdepersonal=" + gastosdepersonal + ",/n personalocupado=" + personalocupado
				+ ",/n personalremunerado=" + personalremunerado + ",/n personalremuneradoequivalenteatiempocompleto="
				+ personalremuneradoequivalenteatiempocompleto + ",/n horastrabajadasporelpersonalremunerado="
				+ horastrabajadasporelpersonalremunerado + "]";
	}
	
	
	
}
