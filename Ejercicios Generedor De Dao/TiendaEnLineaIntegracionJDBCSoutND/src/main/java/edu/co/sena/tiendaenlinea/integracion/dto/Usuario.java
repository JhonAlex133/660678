/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dto;

import edu.co.sena.tiendaenlinea.integracion.dao.*;
import edu.co.sena.tiendaenlinea.integracion.factory.*;
import edu.co.sena.tiendaenlinea.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Usuario implements Serializable
{
	/** 
	 * This attribute maps to the column idUsuario in the usuario table.
	 */
	protected String idUsuario;

	/** 
	 * This attribute maps to the column contrasena in the usuario table.
	 */
	protected String contrasena;

	/** 
	 * This attribute maps to the column rol in the usuario table.
	 */
	protected String rol;

	/** 
	 * This attribute maps to the column estado in the usuario table.
	 */
	protected String estado;

	/**
	 * Method 'Usuario'
	 * 
	 */
	public Usuario()
	{
	}

	/**
	 * Method 'getIdUsuario'
	 * 
	 * @return String
	 */
	public String getIdUsuario()
	{
		return idUsuario;
	}

	/**
	 * Method 'setIdUsuario'
	 * 
	 * @param idUsuario
	 */
	public void setIdUsuario(String idUsuario)
	{
		this.idUsuario = idUsuario;
	}

	/**
	 * Method 'getContrasena'
	 * 
	 * @return String
	 */
	public String getContrasena()
	{
		return contrasena;
	}

	/**
	 * Method 'setContrasena'
	 * 
	 * @param contrasena
	 */
	public void setContrasena(String contrasena)
	{
		this.contrasena = contrasena;
	}

	/**
	 * Method 'getRol'
	 * 
	 * @return String
	 */
	public String getRol()
	{
		return rol;
	}

	/**
	 * Method 'setRol'
	 * 
	 * @param rol
	 */
	public void setRol(String rol)
	{
		this.rol = rol;
	}

	/**
	 * Method 'getEstado'
	 * 
	 * @return String
	 */
	public String getEstado()
	{
		return estado;
	}

	/**
	 * Method 'setEstado'
	 * 
	 * @param estado
	 */
	public void setEstado(String estado)
	{
		this.estado = estado;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Usuario)) {
			return false;
		}
		
		final Usuario _cast = (Usuario) _other;
		if (idUsuario == null ? _cast.idUsuario != idUsuario : !idUsuario.equals( _cast.idUsuario )) {
			return false;
		}
		
		if (contrasena == null ? _cast.contrasena != contrasena : !contrasena.equals( _cast.contrasena )) {
			return false;
		}
		
		if (rol == null ? _cast.rol != rol : !rol.equals( _cast.rol )) {
			return false;
		}
		
		if (estado == null ? _cast.estado != estado : !estado.equals( _cast.estado )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idUsuario != null) {
			_hashCode = 29 * _hashCode + idUsuario.hashCode();
		}
		
		if (contrasena != null) {
			_hashCode = 29 * _hashCode + contrasena.hashCode();
		}
		
		if (rol != null) {
			_hashCode = 29 * _hashCode + rol.hashCode();
		}
		
		if (estado != null) {
			_hashCode = 29 * _hashCode + estado.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UsuarioPk
	 */
	public UsuarioPk createPk()
	{
		return new UsuarioPk(idUsuario);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.integracion.dto.Usuario: " );
		ret.append( "idUsuario=" + idUsuario );
		ret.append( ", contrasena=" + contrasena );
		ret.append( ", rol=" + rol );
		ret.append( ", estado=" + estado );
		return ret.toString();
	}

}
