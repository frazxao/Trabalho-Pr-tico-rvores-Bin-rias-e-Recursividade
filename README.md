# Trabalho Prático – Árvores Binárias e Recursividade
**Disciplina:** Estrutura de Dados  
**Professor:** Prof. Anderson Soares  
**Valor:** 2,0 pontos  
**Entrega:** até 11/05  
**Formato de entrega:** Repositório no GitHub

## Objetivo
Compreender e aplicar recursividade na implementação de uma Árvore Binária de Busca (BST) em Java, com inserção, busca e percursos (pré-ordem, em-ordem e pós-ordem).

## Parte 1 — Conceito e Explicação

### 1. O que é recursividade?
Recursividade é uma técnica de programação onde uma função chama a si mesma para resolver subproblemas menores do mesmo tipo até atingir um caso base (condição de parada). Cada chamada trabalha com um estado reduzido do problema e, após atingir o caso base, as chamadas retornam seus resultados para compor a solução final.

**Exemplo simples:** calcular o fatorial:
- `fatorial(n)` chama `fatorial(n-1)` até `n == 0` (caso base), então retorna 1.

### 2. Como a recursividade é usada na travessia de uma árvore binária?
Na travessia de uma árvore, a recursividade permite visitar cada nó aplicando a mesma operação em subárvores esquerda e direita. Por exemplo, em-ordem (`esquerda -> raiz -> direita`) pode ser implementado como:
- se o nó atual for nulo (caso base), retorna;
- chama recursivamente em-ordem na subárvore esquerda;
- processa (visita) a raiz;
- chama recursivamente em-ordem na subárvore direita.

A mesma ideia vale para pré-ordem e pós-ordem (apenas a ordem das operações muda).

### 3. Qual a diferença entre recursão e laço (for/while)?
- **Recursão** resolve um problema dividindo-o em subproblemas menores e usando chamadas de função; é muitas vezes mais natural para estruturas recursivas (como árvores). Requer cuidado com profundidade de chamadas e casos base.
- **Laços (for/while)** repetem comandos de forma iterativa, mantendo estado em variáveis. Laços podem ser mais eficientes em uso de memória (sem empilhamento de chamadas), mas podem ser menos intuitivos para problemas naturalmente recursivos.
Ambas podem resolver muitos dos mesmos problemas; a escolha depende da clareza e eficiência desejada.

## Parte 2 — Implementação (evidências)
Os arquivos implementados:
- `Node.java` — representação do nó.
- `ArvoreBinaria.java` — implementação da BST usando recursividade (inserir, buscar, pré, em e pós-ordem).
- `Main.java` — testes e saída de exemplo.

### Evidência de execução (exemplo de saída)
Inserindo valores: 50 30 70 20 40 60 80
Em ordem: 20 30 40 50 60 70 80
Pré-ordem: 50 30 20 40 70 60 80
Pós-ordem: 20 40 30 60 80 70 50
Buscar 60: encontrado (true)
Buscar 25: não encontrado (false)


## Observações
- Comentários no código indicam claramente onde ocorrem as chamadas recursivas e qual é o caso base.
- Não foram utilizados laços (for/while) para as operações de inserção, busca ou percursos — tudo feito por recursão.
