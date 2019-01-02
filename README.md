# firstWebTest
<strong>Testes automatizados em uma calculadora de valor a ser pago em um estacionamento.</strong>

<table>
  <tr>
    <td>CASO Nº:</td>
    <td>CT001 – Estacionar por horas</td>
  </tr>
  <tr>
    <td>OBJETIVO DO TESTE:</td>
    <td>Verificar se o sistema retorna o valor correto a ser pago após o cliente ter ocupado o estacionamento Long-Term Garage Parking por 6 horas e 5 minutos.</td>
  </tr>
  <tr>
    <td>REGRA DE PAGAMENTO:</td>
    <td>
      <ul>
        <li>Primeira hora = $2,00. +2 por hora a mais</li>
        <li>Primeiro dia inteiro = $14,00. +12 por dia inteiro a mais</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>ENTRADA:</td>
    <td>
      <ul>
        <li>Tipo de vaga: Long-Term Garage Parking</li>
        <li>Horário de entrada: 09:00 11/13/2018 (formato de data americano)</li>
        <li>Horário de saída: 15:05 11/13/2018</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>PASSOS:</td>
    <td>
      <ol>
        <li>Acessar o site: http://adam.goucher.ca/parkcalc/</li>
        <li>Escolher o tipo de vaga</li>
        <li>Informar horário de entrada</li>
        <li>Informar horário de saída</li>
        <li>Clicar em “Calcular”</li>
      </ol>
    </td>
  </tr>
  <tr>
    <td>CRITÉRIOS DE ÊXITO:</td>
    <td>O sistema imprime o valor de $14,00.</td>
  </tr>
</table>
<table>
  <tr>
    <td>CASO Nº:</td>
    <td>CT002 – Estacionar por 2 dias</td>
  </tr>
  <tr>
    <td>OBJETIVO DO TESTE:</td>
    <td>Verificar se o sistema retorna o valor correto a ser pago após o cliente ter ocupado o estacionamento Economy Parking por 2 dias.</td>
  </tr>
  <tr>
    <td>REGRA DE PAGAMENTO:</td>
    <td>
      <ul>
        <li>Primeira hora = $4,00. +4,00 por hora a mais</li>
        <li>Primeiro dia inteiro = $13,00. +9,00 por dia inteiro a mais</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>ENTRADA:</td>
    <td>
      <ul>
        <li>Tipo de vaga: Economy Parking</li>
        <li>Horário de entrada: 10:07 11/30/2018 (formato de data americano)</li>
        <li>Horário de saída: 10:32 12/02/2018</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>PASSOS:</td>
    <td>
      <ol>
        <li>Acessar o site: http://adam.goucher.ca/parkcalc/</li>
        <li>Escolher o tipo de vaga</li>
        <li>Informar horário de entrada</li>
        <li>Informar horário de saída</li>
        <li>Clicar em “Calcular”</li>
      </ol>
    </td>
  </tr>
  <tr>
    <td>CRITÉRIOS DE ÊXITO:</td>
    <td>O sistema imprime o valor de $22,00.</td>
  </tr>
</table>
