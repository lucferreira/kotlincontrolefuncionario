package com.empresa.kotlinudemyapi.service

import com.empresa.kotlinudemyapi.modelo.Empresa

interface EmpresaService {
	
	fun buscarPorCnpj(cnpj: String): Empresa?
	
	fun persistir(empresa: Empresa): Empresa
}