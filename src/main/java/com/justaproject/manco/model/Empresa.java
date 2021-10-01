package com.justaproject.manco.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empresas")
public class Empresa implements Serializable{
	
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", unique=true, nullable = false)
	private Long id;
	@Column(name="CIF")
	String CIF;
	@Column(name="CNAE")
	String codCNAE;
	@Column(name="Empresa")
	String nomEmpresa;
	@Column(name="mail")
	String email;
	@Column(name="CP")
	String codPostal;
	@Column(name="CifraNegocio")
	int CifraNegocio;

	@Column(name="ValorPrecioCosteProductosServiciosVendidos")
	int ValorPrecioCosteProductosServiciosVendidos;
	@Column(name="ComprasBienesServicios")
	int ComprasBienesServicios;
	@Column(name="GastosPersonal")
	int GastosPersonal;
	@Column(name="MediaPaxOcupadasEmpresa")
	double MediaPaxOcupadasEmpresa;
	
//	@Column(name="Margen_bruto")
//	double Margen_bruto = CifraNegocio-ValorPrecioCosteProductosServiciosVendidos;
//	@Column(name="MB_en_porcentaje")
//	double MB_en_porcentaje = Margen_bruto/CifraNegocio;
//	@Column(name="CifraNegocioXPaxOcupada")
//	double CifraNegocioXPaxOcupada=CifraNegocio/MediaPaxOcupadasEmpresa;
//	@Column(name="GastosPersonalXPaxOcupada")
//	double GastosPersonalXPaxOcupada=GastosPersonal/MediaPaxOcupadasEmpresa;
//	@Column(name="CompraBienesServiciosCifraNegocio")
//	double CompraBienesServiciosCifraNegocio=ComprasBienesServicios/CifraNegocio;
//	@Column(name="ProductividadXPaxOcupada")
//	double ProductividadXPaxOcupada=Margen_bruto/MediaPaxOcupadasEmpresa;
//	@Column(name="GastosPersonalSobreProductividad")
//	double GastosPersonalSobreProductividad=GastosPersonalXPaxOcupada/ProductividadXPaxOcupada;
//	@Column(name="CuotaMercado")
//	double CuotaMercado; //formula sobre dades de CNAE
	
	
	
//	public Empresa() {
//	}
//	public Empresa(String codCNAE, String nomEmpresa, String email, String cIF, String codPostal, int cifraNegocio,
//			int valorPrecioCosteProductosServiciosVendidos, int comprasBienesServicios, int gastosPersonal,
//			double mediaPaxOcupadasEmpresa) {
//		this.codCNAE = codCNAE;
//		this.nomEmpresa = nomEmpresa;
//		this.email = email;
//		CIF = cIF;
//		this.codPostal = codPostal;
//		CifraNegocio = cifraNegocio;
//		ValorPrecioCosteProductosServiciosVendidos = valorPrecioCosteProductosServiciosVendidos;
//		ComprasBienesServicios = comprasBienesServicios;
//		GastosPersonal = gastosPersonal;
//		MediaPaxOcupadasEmpresa = mediaPaxOcupadasEmpresa;
//	}
	
	
	public String getCodCNAE() {
		return codCNAE;
	}
	public Long getId() {
		return id;
	}

	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public void setCodCNAE(String codCNAE) {
		this.codCNAE = codCNAE;
	}
	public String getNomEmpresa() {
		return nomEmpresa;
	}
	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public int getCifraNegocio() {
		return CifraNegocio;
	}
	public void setCifraNegocio(int cifraNegocio) {
		CifraNegocio = cifraNegocio;
	}
	public int getValorPrecioCosteProductosServiciosVendidos() {
		return ValorPrecioCosteProductosServiciosVendidos;
	}
	public void setValorPrecioCosteProductosServiciosVendidos(int valorPrecioCosteProductosServiciosVendidos) {
		ValorPrecioCosteProductosServiciosVendidos = valorPrecioCosteProductosServiciosVendidos;
	}
	public int getComprasBienesServicios() {
		return ComprasBienesServicios;
	}
	public void setComprasBienesServicios(int comprasBienesServicios) {
		ComprasBienesServicios = comprasBienesServicios;
	}
	public int getGastosPersonal() {
		return GastosPersonal;
	}
	public void setGastosPersonal(int gastosPersonal) {
		GastosPersonal = gastosPersonal;
	}
	public double getMediaPaxOcupadasEmpresa() {
		return MediaPaxOcupadasEmpresa;
	}
	public void setMediaPaxOcupadasEmpresa(double mediaPaxOcupadasEmpresa) {
		MediaPaxOcupadasEmpresa = mediaPaxOcupadasEmpresa;
	}

@Override
public String toString() {
	return "Empresa [CIF=" + CIF + ", codCNAE=" + codCNAE + ", nomEmpresa=" + nomEmpresa + ", email=" + email
			+ ", codPostal=" + codPostal + ", CifraNegocio=" + CifraNegocio
			+ ", ValorPrecioCosteProductosServiciosVendidos=" + ValorPrecioCosteProductosServiciosVendidos
			+ ", ComprasBienesServicios=" + ComprasBienesServicios + ", GastosPersonal=" + GastosPersonal
			+ ", MediaPaxOcupadasEmpresa=" + ",MediaPaxOcupadasEmpresa]";
}

}
