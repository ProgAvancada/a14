# Painel

Criação dos paineis. Utiliza 2 padrões de projeto:

a) Strategy

Cada estratégia de layout é representada por uma classe, filha de LayoutStrategy. Utilizamos o enum do Java para 
implementar as classes filhas. O enum do Java é chamado de "Typesafe Enum Pattern"

b) Composite

O painel implementa a interface Component. Portanto, ele também é um componente de tela. Seu comportamento delega 
para os filhos praticamente todas as atividades, assim, ele age como um agrupador. Mas, por também ser um componente, 
pode ser agrupado dentro de outros paineis.

Também utilizamos uma técnica chamada Invocation Chaining no método add do painel para permitir chamadas como:
painel.add(button).add(button2);