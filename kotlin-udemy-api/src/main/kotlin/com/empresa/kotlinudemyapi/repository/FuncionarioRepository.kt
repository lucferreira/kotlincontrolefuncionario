package com.empresa.kotlinudemyapi.repository

import com.empresa.kotlinudemyapi.modelo.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario,String>{

	fun findByEmail(email: String): Funcionario
	
	fun findByCpf(cpf: String): Funcionario

}