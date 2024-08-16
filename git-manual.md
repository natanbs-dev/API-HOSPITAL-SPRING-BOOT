# git configs

![git-configs-praticas](https://images8.alphacoders.com/430/thumb-1920-430944.jpg)

## processo de criação do repositório
Ainda seguindo os passos durante a faculdade, sigo criando, primeiramente, o repositório online e clonando localmente

## comandos:
- **git checkout -b <branch>:** Adicionar uma nova branch e, em  seguida, entrar nessa mesma branch
- **git restore --staged .\<file>:** Caso tenha adicionado uma arquivo por engano no commit, esse comando remove o arquivo selecionado
- **git merge <branch>:** Estando na branch *main*, para conseguir fazer o marge com a outra branch, basta antes:
	- **git checkout main**
	- **git pull origin main**
	- **git merge branch**
---
## **Tipagem de Commits**:
   - Utilize prefixos para categorizar os commits:
     - `feat:` - Novo recurso
     - `fix:` - Correção de bug
     - `docs:` - Alterações na documentação
     - `style:` - Formatação e estilo (não afeta a lógica do código)
     - `refactor:` - Refatoração de código
     - `test:` - Adição ou correção de testes
     - `edit:` - Edições do README.md ou algum comentário em qualquer linha que for


## visibilidade:
Pensando, em um primeiro momento, manter como privado diante de futuras alterações de código em mente

---

