# Sistema de Bootcamps e Desenvolvedores

Este é um sistema de exemplo que modela a relação entre bootcamps, conteúdos, desenvolvedores e seu progresso em cursos e mentorias. Este sistema foi criado com o objetivo de demonstrar a estrutura de classes em Java para gerenciar essas entidades e calcular o progresso de desenvolvedores.

## Visão Geral

O sistema é composto por quatro classes principais:

1. **Bootcamp**: Representa um programa de treinamento. Cada bootcamp tem um nome, descrição, data inicial e data final. Ele também mantém uma lista de desenvolvedores inscritos e uma lista de conteúdos associados.

2. **Dev (Desenvolvedor)**: Representa um desenvolvedor. Cada desenvolvedor possui um nome e pode se inscrever em bootcamps. Eles também mantêm duas listas: conteúdos inscritos e conteúdos concluídos.

3. **Conteudo**: Uma classe abstrata que representa o conteúdo de um bootcamp. As classes `Curso` e `Mentoria` são subclasses que implementam o método `conteudo()` de acordo com suas próprias regras.

4. **Curso e Mentoria**: Representam tipos específicos de conteúdo em um bootcamp. Cada um deles tem características únicas que afetam o cálculo de progresso.

## Uso

No método `main` da classe `Main`, dois desenvolvedores, Hudson e Davi, são criados, e eles se inscrevem em bootcamps diferentes. Em seguida, eles progridem em seus conteúdos inscritos e o progresso é calculado com base na conclusão de cursos e mentorias.

Para executar o sistema:

1. Clone ou faça o download deste repositório para a sua máquina local.
2. Importe o projeto em sua IDE Java preferida.
3. Execute a classe `Main`.

## Personalização

Você pode personalizar o sistema adicionando mais bootcamps, desenvolvedores e conteúdos, ajustando as cargas de cursos, datas de mentorias e qualquer outra informação que desejar.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

## Autor

- Hudson Silva