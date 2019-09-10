package com.empresa.kotlinudemyapi.serviceImpl

import com.empresa.kotlinudemyapi.repository.EmpresaRepository
import com.empresa.kotlinudemyapi.service.EmpresaService
import org.springframework.stereotype.Service
import com.empresa.kotlinudemyapi.modelo.Empresa

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService{
	
	override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)
	
	override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)
	
}