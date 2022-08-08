# EventoObserver
<h2>Eventos com o padrão (patterns) observer</h2>

<h3>clientes</h3>
Aqui nesta pasta vamos deixar tudo relacionado aos clientes.
<br>**Service:**
>Aqui se localiza o serviço que vai notificar o cliente quando ativarmos ele.
>> temos aqui o metodo de ativarCliente que espera receber um cliente.

<br>**Controller:**
>Aqui vamos escolher um cliente para ativarmos e então passar ele como parametro para o ativarCliente.

<br>**Cliente:**
>Esta é a nossa class de cliente, que diz os atributos que o cliente tem.

<h3>notificadores</h3>
Temos a interface **Notificador** ela é com ela que fazemos a inversão de controle.
Utilizamos os notificadores como base dizendo o que precisa ter (um contrato) e quem implementa essa interface, terá que seguir este contrato.

**Os demais notificadores**<br>
É interessante ressaltarmos que todos implementam a interface notificadores, porém anotamos ele como o bean @Component, e este faz a **INVERSÂO DE CONTROLE**
pois invés de implementarmos um acoplamento forte nessas classes, deixamos a cargo do spring, de maneira que: A class que tiver com o @Component e com a anotation
`@Qualifier` com o parametro desejado, vai ser levado em consideração.

**@QUALIFIER:** Com o qualifier a gente consegue definir qual modelo vamos deixar de envio. Se quisermos um dia trocar de rapido para devagar, mudamos somente nas class que implementa e ta tudo certo.
Agora o rapido está com whatsApp, caso algum dia queira mudar e o rapido seja email, é so trocarmos.
Dessa maneira o baixo acoplamento vai se manter.

>PROBLEMA DE AMBIGUIDADE:
>> acontece quando temos mais de 1 bean sendo injetado ao mesmo tempo em uma class que espera somente 1 injeção e não varias. (No nosso caso o notificador)

**ATIVAR CLIENTE** 
Na classe Ativar Cliente Sevice eu instancio a primeiro momento o ApplicationEventPublisher, com ele eu posso publicar um evento, e quem estiver escutando este evento, pode capturar o que eu passei por parametro e tratar como quiser.

**NOTIFICAÇÃO SERVICE**

No notificação Service, vai exister uma anotation que faz com que execute aquele metodo quando algum evento é publicado.
Fazemos isso pelo container do spring, lançamos o evento e com o @Service ou @Component, dizemos que esta class é um container do spring <br>
O proximo passo é anotar o metodo que queremos executar quando um evento existir no container spring, e anotamos com @EventListener, assim o metodo anotado com isso, vai receber um cliente e será executado.

**OBSERVAÇÕES SOBRE EVENTOS**
Podemos ter algumas publicações de eventos e algumas escutas, eu poderia notificar o cliente se ele fosse ativado também, ou seja, cabe algumas implementações <br>
Outro ponto bem bacana é que não temos na classe de AtivarClienteService a responsabilidade de notificar um cliente, ela não irá saber de nada, outra classe que pegará essa responsabilidade e ganhamos assim um codigo muito mais coeso.
