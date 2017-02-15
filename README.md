# projetoAutomatizacao

Descrição:

Projeto de automação de testes, desenvolvido na IDE Eclipse.
Tem como objetivo automatizar casos de teste da IDE CronApp, para que possam ser usados em testes de regressão.


Instruções de execução:

Para que o projeto seja executado em sua máquina, deve ser instalado e configurado o driver para abrir o Firefox.

Para instalação, faça o download em https://github.com/mozilla/geckodriver/releases , neste projeto foi usado o driver 
geckodriver-v0.10.0-win64 .

Baixe o executável em sua máquina e referencie o caminho na classe 
projetoAutomatizacao/projetoAutomatizacao/src/test/java/io/cronapp/projetoAutomatizacao/util/GerenciamentoDriver.java

Exemplo:
System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");

Observação: utilizar a versão mais atual do navegador Mozilla a versão utilizada no desenvolvimento dos testes foi 51.0.1
