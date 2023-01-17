package com.Morys.Model.Entities.Responses;

import com.Morys.Model.Entities.Procedimento;
import com.Morys.Model.Entities.Solicitacao;

import java.util.List;

public class SolicitacaoDTO {
    private ClienteDTO clienteDTO;
    private PrestadorDTO prestadorDTO;
    private List<ProcedimentoDTO> procedimentoDTOList;

    public SolicitacaoDTO(ClienteDTO clienteDTO, PrestadorDTO prestadorDTO, List<ProcedimentoDTO> procedimentoDTOList) {
        this.clienteDTO = clienteDTO;
        this.prestadorDTO = prestadorDTO;
        this.procedimentoDTOList = procedimentoDTOList;
    }

    public SolicitacaoDTO() {
    }

    public final SolicitacaoDTO toSolicitacaoDTO(Solicitacao solicitacao){
        SolicitacaoDTO solicitacaoDTO = new SolicitacaoDTO();
        solicitacaoDTO.setClienteDTO(new ClienteDTO(solicitacao.getCliente()));
        solicitacaoDTO.setPrestadorDTO(new PrestadorDTO(solicitacao.getPrestador()));
        solicitacaoDTO.setProcedimentoDTOList(solicitacao.getProcedimentos().stream().map((Procedimento t) -> new ProcedimentoDTO(t)).toList());
        return solicitacaoDTO;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public PrestadorDTO getPrestadorDTO() {
        return prestadorDTO;
    }

    public void setPrestadorDTO(PrestadorDTO prestadorDTO) {
        this.prestadorDTO = prestadorDTO;
    }

    public List<ProcedimentoDTO> getProcedimentoDTOList() {
        return procedimentoDTOList;
    }

    public void setProcedimentoDTOList(List<ProcedimentoDTO> procedimentoDTOList) {
        this.procedimentoDTOList = procedimentoDTOList;
    }


}
