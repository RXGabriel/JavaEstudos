public enum StatusNotaFiscal {
    NAO_EMITIDA("Não Emitida"){
        @Override
        public boolean PodeMudarParaCancelado(double valor) {
            return true;
        }

        @Override
        public boolean PodeMudarParaEmitido(double valor) {
            return true;
        }
    }
    ,EMITIDA("Emitida"){
        @Override
        public boolean PodeMudarParaCancelado(double valor) {
            return valor < 1_000;
        }

        @Override
        public boolean PodeMudarParaEmitido(double valor) {
            return false;
        }
    }
    ,CANCELADA("Cancelada"){
        @Override
        public boolean PodeMudarParaCancelado(double valor) {
            return false;
        }

        @Override
        public boolean PodeMudarParaEmitido(double valor) {
            return false;
        }
    };

    private String descricao;

    StatusNotaFiscal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract boolean PodeMudarParaCancelado(double valor);
    public abstract boolean PodeMudarParaEmitido(double valor);
}
