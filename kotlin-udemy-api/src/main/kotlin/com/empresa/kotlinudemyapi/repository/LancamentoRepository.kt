package com.empresa.kotlinudemyapi.repository

import com.empresa.kotlinudemyapi.modelo.Lancamento
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface LancamentoRepository : MongoRepository<Lancamento, String>{

	//Busca Paginada (Lista Paginada = Pageable)
	fun findByFuncionarioId(funcionarioId: String, pageable: Pageable): Page<Lancamento> 

}