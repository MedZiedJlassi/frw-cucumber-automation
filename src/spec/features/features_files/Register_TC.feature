Feature: Je rempli le formulaire
  Entant qu utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @module_register
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l application Mercury
    When Je clique sur le bouton REGISTER
    When Je saisi un data dans le champs firstname "<firstname>"
    When Je saisi un data dans le champs lastname "<lastname>"

    Examples: 
      | firstname | lastname  |
      | Olfa      | Hadhbeoui |
      | Amine     | Ferjani   |
