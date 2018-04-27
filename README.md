# Painel

Criação dos paineis. Utiliza 2 padrões de projeto:

a) [Strategy](https://robsoncastilho.com.br/2011/06/25/conhecendo-design-patterns-e-o-padrao-strategy/)

Cada estratégia de layout é representada por uma classe, filha de LayoutStrategy. Utilizamos o enum do Java para 
implementar as classes filhas. O enum do Java é chamado de ["Typesafe Enum Pattern"](http://www.javapractices.com/topic/TopicAction.do?Id=1)

b) [Composite](https://robsoncastilho.com.br/2013/07/10/design-patterns-usando-composite-para-montar-uma-estrutura-em-arvore/)

O painel implementa a interface Component. Portanto, ele também é um componente de tela. Seu comportamento delega 
para os filhos praticamente todas as atividades, assim, ele age como um agrupador. Mas, por também ser um componente, 
pode ser agrupado dentro de outros paineis.

Também utilizamos uma técnica chamada Method Chaining nos métodos add e setLayout do painel para permitir chamadas 
como: painel.add(button).add(button2); Veja o exemplo no metodo construtor da classe App.

Embora não visto em aula, neste projeto inclui melhorias no desenho dos componentes. Isso permitirá visualizar melhor o 
resultado da próxima atividade. 