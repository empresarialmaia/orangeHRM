
@regressivoTelaprincipal
Feature: Tela principal
        COMO usuario adm do sistema
        QUERO navegar pela tela princial do sistema
        PARA executar as atividades necessarias
        
       Background: Configuracao inicial 
         Given que esteja na tela principal ja logado "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
        

  @positivoTelaPrincipal
  Scenario: Buscar um item existente nas opcoes de menu pela barra de pesquisa
    When escrever na barra de pesquisa a opcao desejada
    And o sistema informa as opcoes com base na palavra informada
    Then clico na opcao que foi disponibilizada pelo sistema com base na palavra informada

  
  @negativoTelaPrincipal
  Scenario: Buscar um item não existente nas opcoes de menu pela barra de pesquisa
    When escrever na barra de pesquisa uma opcao não existe desejada 
    Then o sistema nao informa nenhuma opcao com base na palavra informada
    
   
  
  
