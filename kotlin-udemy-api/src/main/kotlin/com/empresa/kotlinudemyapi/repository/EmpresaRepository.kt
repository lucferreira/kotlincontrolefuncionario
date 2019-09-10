package com.empresa.kotlinudemyapi.repository

import com.empresa.kotlinudemyapi.modelo.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String>{
	
	fun findByCnpj(cnpj: String): Empresa
}