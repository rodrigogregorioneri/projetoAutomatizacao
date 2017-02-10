package io.cronapp.projetoAutomatizacao.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import io.cronapp.projetoAutomatizacao.cases.CaseTestTeste;
import io.cronapp.projetoAutomatizacao.cases.Paas_94;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CaseTestTeste.class,
	Paas_94.class
	
})
public class SeleniumSuite {

}
