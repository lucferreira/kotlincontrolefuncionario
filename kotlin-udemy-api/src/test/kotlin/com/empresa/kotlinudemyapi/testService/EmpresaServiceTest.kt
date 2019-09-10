package com.empresa.kotlinudemyapi.testService

import com.empresa.kotlinudemyapi.modelo.Empresa
import com.empresa.kotlinudemyapi.repository.EmpresaRepository
import com.empresa.kotlinudemyapi.service.EmpresaService
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class EmpresaServiceTest {
	
	@Autowired
	val empresaService: EmpresaService? = null
	
	@MockBean
	private val empresaRepository: EmpresaRepository? = null
	
	private val cnpj = "41762460000134"
	
	private fun empresa(): Empresa = Empresa(razaoSocial= "Razão Social", cnpj = "41762460000134", id= "1")
	
	@Before
	@Throws(Exception::class)
	fun setUp(){
		BDDMockito.given(empresaRepository?.findByCnpj(cnpj)).willReturn(empresa())
		BDDMockito.given(empresaRepository?.save(empresa())).willReturn(empresa())
	}
	
	@Test
	fun testBuscarEmpresaPorCnpj(){
		val empresa: Empresa? = empresaService?.buscarPorCnpj(cnpj)
		Assert.assertNotNull(empresa);
	}
	
	@Test
	fun testPersistirEmpresa(){
		val empresa: Empresa? = empresaService?.persistir(empresa())
		Assert.assertNotNull(empresa)
	}
	
	
	
	
	
	
}