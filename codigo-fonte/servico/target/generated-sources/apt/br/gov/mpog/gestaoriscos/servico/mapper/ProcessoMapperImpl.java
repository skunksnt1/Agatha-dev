package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Processo;

import br.gov.mpog.gestaoriscos.modelo.ProcessoAnexo;

import br.gov.mpog.gestaoriscos.modelo.Responsavel;

import br.gov.mpog.gestaoriscos.modelo.dto.ProcessoAnexoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.ProcessoDTO;

import br.gov.mpog.gestaoriscos.modelo.dto.ResponsavelDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:20-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class ProcessoMapperImpl implements ProcessoMapper {

    @Autowired

    private AnaliseMapper analiseMapper;

    @Autowired

    private IdentificacaoMapper identificacaoMapper;

    @Autowired

    private AvaliacaoMapper avaliacaoMapper;

    @Autowired

    private ResponsavelMapper responsavelMapper;

    @Autowired

    private UsuarioMapper usuarioMapper;

    @Autowired

    private StatusProcessoMapper statusProcessoMapper;

    @Autowired

    private CalculadoraMapper calculadoraMapper;

    @Autowired

    private ProcessoAnexoMapper processoAnexoMapper;

    @Autowired

    private MacroprocessoMapper macroprocessoMapper;

    @Autowired

    private DecisaoProcessoMapper decisaoProcessoMapper;

    @Override

    public ProcessoDTO processoToProcessoDTO(Processo processo) {

        if ( processo == null ) {

            return null;
        }

        ProcessoDTO processoDTO = new ProcessoDTO();

        processoDTO.setExcluido( processo.isExcluido() );

        processoDTO.setId( processo.getId() );

        processoDTO.setProcesso( processo.getProcesso() );

        processoDTO.setSearch( processo.getSearch() );

        processoDTO.setDiretoria( processo.getDiretoria() );

        processoDTO.setCoordenacao( processo.getCoordenacao() );

        processoDTO.setObjetivo( processo.getObjetivo() );

        processoDTO.setLei( processo.getLei() );

        processoDTO.setSistema( processo.getSistema() );

        processoDTO.setDtCadastro( processo.getDtCadastro() );

        processoDTO.setDtInicio( processo.getDtInicio() );

        processoDTO.setDtFim( processo.getDtFim() );

        processoDTO.setDtValidacao( processo.getDtValidacao() );

        processoDTO.setJustificativa( processo.getJustificativa() );

        processoDTO.setMacroprocesso( macroprocessoMapper.toDto( processo.getMacroprocesso() ) );

        processoDTO.setStatus( statusProcessoMapper.statusProcessoToStatusProcessoDTO( processo.getStatus() ) );

        processoDTO.setGestor( usuarioMapper.usuarioToUsuarioDTO( processo.getGestor() ) );

        List<ResponsavelDTO> list = responsavelMapper.responsavelToResponsavelDTOs( processo.getResponsaveis() );

        if ( list != null ) {

            processoDTO.setResponsaveis( list );
        }

        List<ProcessoAnexoDTO> list_ = processoAnexoMapper.processoAnexosToProcessoAnexoDTOs( processo.getAnexos() );

        if ( list_ != null ) {

            processoDTO.setAnexos( list_ );
        }

        processoDTO.setAnalise( analiseMapper.analiseToAnaliseDTO( processo.getAnalise() ) );

        processoDTO.setIdentificacao( identificacaoMapper.identificacaoToIdentificacaoDTO( processo.getIdentificacao() ) );

        processoDTO.setAvaliacao( avaliacaoMapper.avaliacaoToAvaliacaoDTO( processo.getAvaliacao() ) );

        processoDTO.setCalculadora( calculadoraMapper.calculadoraToCalculadoraDTO( processo.getCalculadora() ) );

        processoDTO.setDecisao( decisaoProcessoMapper.decisaoProcessoToDecisaoProcessoDTO( processo.getDecisao() ) );

        return processoDTO;
    }

    @Override

    public List<ProcessoDTO> processosToProcessoDTOs(List<Processo> processos) {

        if ( processos == null ) {

            return null;
        }

        List<ProcessoDTO> list = new ArrayList<ProcessoDTO>();

        for ( Processo processo : processos ) {

            list.add( processoToProcessoDTO( processo ) );
        }

        return list;
    }

    @Override

    public Processo processoDTOToProcesso(ProcessoDTO processoDTO) {

        if ( processoDTO == null ) {

            return null;
        }

        Processo processo = new Processo();

        processo.setExcluido( processoDTO.isExcluido() );

        processo.setId( processoDTO.getId() );

        processo.setProcesso( processoDTO.getProcesso() );

        processo.setSearch( processoDTO.getSearch() );

        processo.setDiretoria( processoDTO.getDiretoria() );

        processo.setCoordenacao( processoDTO.getCoordenacao() );

        processo.setObjetivo( processoDTO.getObjetivo() );

        processo.setLei( processoDTO.getLei() );

        processo.setSistema( processoDTO.getSistema() );

        processo.setDtCadastro( processoDTO.getDtCadastro() );

        processo.setDtInicio( processoDTO.getDtInicio() );

        processo.setDtFim( processoDTO.getDtFim() );

        processo.setDtValidacao( processoDTO.getDtValidacao() );

        processo.setJustificativa( processoDTO.getJustificativa() );

        processo.setStatus( statusProcessoMapper.statusProcessoDTOToStatusProcesso( processoDTO.getStatus() ) );

        processo.setMacroprocesso( macroprocessoMapper.toEntity( processoDTO.getMacroprocesso() ) );

        processo.setGestor( usuarioMapper.usuarioDTOToUsuario( processoDTO.getGestor() ) );

        List<Responsavel> list = responsavelMapper.responsavelDTOsToResponsavels( processoDTO.getResponsaveis() );

        if ( list != null ) {

            processo.setResponsaveis( list );
        }

        List<ProcessoAnexo> list_ = processoAnexoMapper.processoAnexoDTOsToProcessoAnexos( processoDTO.getAnexos() );

        if ( list_ != null ) {

            processo.setAnexos( list_ );
        }

        processo.setAnalise( analiseMapper.analiseDTOToAnalise( processoDTO.getAnalise() ) );

        processo.setIdentificacao( identificacaoMapper.identificacaoDTOToIdentificacao( processoDTO.getIdentificacao() ) );

        processo.setAvaliacao( avaliacaoMapper.avaliacaoDTOToAvaliacao( processoDTO.getAvaliacao() ) );

        processo.setCalculadora( calculadoraMapper.calculadoraDTOToCalculadora( processoDTO.getCalculadora() ) );

        processo.setDecisao( decisaoProcessoMapper.decisaoProcessoDTOToDecisaoProcesso( processoDTO.getDecisao() ) );

        return processo;
    }

    @Override

    public List<Processo> processoDTOsToProcessos(List<ProcessoDTO> processoDTOs) {

        if ( processoDTOs == null ) {

            return null;
        }

        List<Processo> list = new ArrayList<Processo>();

        for ( ProcessoDTO processoDTO : processoDTOs ) {

            list.add( processoDTOToProcesso( processoDTO ) );
        }

        return list;
    }
}

