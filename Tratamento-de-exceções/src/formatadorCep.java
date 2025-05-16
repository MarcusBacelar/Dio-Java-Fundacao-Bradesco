public class formatadorCep {
  /**
   * @param args
   */
  public static void main(String[] args) {
      try {
          String cepNaoFormatado = "2378234"; // Exemplo de CEP não formatado
          String cepFormatado = formatarCep(cepNaoFormatado);
          System.out.println("CEP Formatado: " + cepFormatado);
      } catch (CepInvalidoException e) {
          System.out.println("Erro: CEP Inválido - " + e.getMessage());
      }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
      if (cep.length() != 8) {
          throw new CepInvalidoException("O CEP deve conter 8 dígitos.");
      }

      // Simulando a formatação do CEP
      return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5, 8);
  }
}

// Crie a classe CepInvalidoException (se ainda não existir)
class CepInvalidoException extends Exception {
  public CepInvalidoException(String message) {
      super(message);
  }

  public CepInvalidoException() {
      super("CEP inválido.");
  }
}