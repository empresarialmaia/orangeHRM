
@regressivoLogin 
Feature: Login
  COMO usuario do site Orange
  QUERO efetuar login
  PARA acessar todas as funcionalidades disponiveis do site
  
  
  Background: Configuracao inicial 
           Given que eu esteja na tela de login "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  @positivo
  Scenario: Login com sucesso   
    When informar os dados validos
    And clica no botao login 
    Then login efetuado com sucesso direcionando para tela de usuario logado 
    
 
 @negativo01 
 Scenario: Login usuario errado
    When informar usuario errado e senha correta
    But clica no botao login 
    Then aparece mensagem de erro
  
 @negativo02 
 Scenario: Login senha errada
    When informar usuario correto e senha errada
    But clica no botao login 
    Then aparece mensagem de erro
   
@negativo03 
 Scenario: Login usuario em branco
    When deixar o campo usuario em branco
    But clica no botao login 
    Then aparece mensagem de erro usuario em branco  
    
@negativo04 
 Scenario: Login senha em branco
    When deixar o campo senha em branco
    But clica no botao login 
    Then aparece mensagem de erro senha em branco      
 
  