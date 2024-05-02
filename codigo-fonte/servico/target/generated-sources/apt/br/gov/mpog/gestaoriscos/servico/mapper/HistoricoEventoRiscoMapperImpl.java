package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.HistoricoEventoRisco;

import br.gov.mpog.gestaoriscos.modelo.Usuario;

import br.gov.mpog.gestaoriscos.modelo.dto.HistoricoEventoRiscoDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:21-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class HistoricoEventoRiscoMapperImpl implements HistoricoEventoRiscoMapper {

    @Override

    public List<HistoricoEventoRisco> toEntity(List<HistoricoEventoRiscoDTO> dtoList) {

        if ( dtoList == null ) {

            return null;
        }

        List<HistoricoEventoRisco> list = new ArrayList<HistoricoEventoRisco>();

        for ( HistoricoEventoRiscoDTO historicoEventoRiscoDTO : dtoList ) {

            list.add( toEntity( historicoEventoRiscoDTO ) );
        }

        return list;
    }

    @Override

    public List<HistoricoEventoRiscoDTO> toDto(List<HistoricoEventoRisco> entityList) {

        if ( entityList == null ) {

            return null;
        }

        List<HistoricoEventoRiscoDTO> list = new ArrayList<HistoricoEventoRiscoDTO>();

        for ( HistoricoEventoRisco historicoEventoRisco : entityList ) {

            list.add( toDto( historicoEventoRisco ) );
        }

        return list;
    }

    @Override

    public HistoricoEventoRisco toEntity(HistoricoEventoRiscoDTO historicoEventoRiscoDTO) {

        if ( historicoEventoRiscoDTO == null ) {

            return null;
        }

        HistoricoEventoRisco historicoEventoRisco_ = new HistoricoEventoRisco();

        Usuario usuario = new Usuario();

        historicoEventoRisco_.setUsuario( usuario );

        usuario.setNome( historicoEventoRiscoDTO.getUsuarioNome() );

        historicoEventoRisco_.setExcluido( historicoEventoRiscoDTO.isExcluido() );

        historicoEventoRisco_.setId( historicoEventoRiscoDTO.getId() );

        historicoEventoRisco_.setDtCadastro( historicoEventoRiscoDTO.getDtCadastro() );

        historicoEventoRisco_.setEvento( historicoEventoRiscoDTO.getEvento() );

        return historicoEventoRisco_;
    }

    @Override

    public HistoricoEventoRiscoDTO toDto(HistoricoEventoRisco historicoEventoRisco) {

        if ( historicoEventoRisco == null ) {

            return null;
        }

        HistoricoEventoRiscoDTO historicoEventoRiscoDTO_ = new HistoricoEventoRiscoDTO();

        historicoEventoRiscoDTO_.setUsuarioNome( historicoEventoRiscoUsuarioNome( historicoEventoRisco ) );

        historicoEventoRiscoDTO_.setId( historicoEventoRisco.getId() );

        historicoEventoRiscoDTO_.setExcluido( historicoEventoRisco.isExcluido() );

        historicoEventoRiscoDTO_.setEvento( historicoEventoRisco.getEvento() );

        historicoEventoRiscoDTO_.setDtCadastro( historicoEventoRisco.getDtCadastro() );

        return historicoEventoRiscoDTO_;
    }

    private String historicoEventoRiscoUsuarioNome(HistoricoEventoRisco historicoEventoRisco) {

        if ( historicoEventoRisco == null ) {

            return null;
        }

        Usuario usuario = historicoEventoRisco.getUsuario();

        if ( usuario == null ) {

            return null;
        }

        String nome = usuario.getNome();

        if ( nome == null ) {

            return null;
        }

        return nome;
    }
}

