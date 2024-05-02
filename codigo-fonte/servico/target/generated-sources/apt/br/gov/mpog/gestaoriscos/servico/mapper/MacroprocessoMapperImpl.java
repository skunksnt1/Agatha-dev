package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.Macroprocesso;

import br.gov.mpog.gestaoriscos.modelo.Orgao;

import br.gov.mpog.gestaoriscos.modelo.dto.MacroprocessoDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:22-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class MacroprocessoMapperImpl implements MacroprocessoMapper {

    @Override

    public List<Macroprocesso> toEntity(List<MacroprocessoDTO> dtoList) {

        if ( dtoList == null ) {

            return null;
        }

        List<Macroprocesso> list = new ArrayList<Macroprocesso>();

        for ( MacroprocessoDTO macroprocessoDTO : dtoList ) {

            list.add( toEntity( macroprocessoDTO ) );
        }

        return list;
    }

    @Override

    public List<MacroprocessoDTO> toDto(List<Macroprocesso> entityList) {

        if ( entityList == null ) {

            return null;
        }

        List<MacroprocessoDTO> list = new ArrayList<MacroprocessoDTO>();

        for ( Macroprocesso macroprocesso : entityList ) {

            list.add( toDto( macroprocesso ) );
        }

        return list;
    }

    @Override

    public Macroprocesso toEntity(MacroprocessoDTO macroprocessoDTO) {

        if ( macroprocessoDTO == null ) {

            return null;
        }

        Macroprocesso macroprocesso_ = new Macroprocesso();

        Orgao secretaria = new Orgao();

        macroprocesso_.setSecretaria( secretaria );

        secretaria.setId( macroprocessoDTO.getSecretariaId() );

        secretaria.setSigla( macroprocessoDTO.getSecretariaSigla() );

        macroprocesso_.setExcluido( macroprocessoDTO.isExcluido() );

        macroprocesso_.setDescricao( macroprocessoDTO.getDescricao() );

        macroprocesso_.setStatus( macroprocessoDTO.isStatus() );

        macroprocesso_.setSearch( macroprocessoDTO.getSearch() );

        macroprocesso_.setId( macroprocessoDTO.getId() );

        return macroprocesso_;
    }

    @Override

    public MacroprocessoDTO toDto(Macroprocesso macroprocesso) {

        if ( macroprocesso == null ) {

            return null;
        }

        MacroprocessoDTO macroprocessoDTO_ = new MacroprocessoDTO();

        macroprocessoDTO_.setSecretariaSigla( macroprocessoSecretariaSigla( macroprocesso ) );

        macroprocessoDTO_.setSecretariaId( macroprocessoSecretariaId( macroprocesso ) );

        macroprocessoDTO_.setId( macroprocesso.getId() );

        macroprocessoDTO_.setExcluido( macroprocesso.isExcluido() );

        macroprocessoDTO_.setDescricao( macroprocesso.getDescricao() );

        macroprocessoDTO_.setSearch( macroprocesso.getSearch() );

        macroprocessoDTO_.setStatus( macroprocesso.isStatus() );

        return macroprocessoDTO_;
    }

    private String macroprocessoSecretariaSigla(Macroprocesso macroprocesso) {

        if ( macroprocesso == null ) {

            return null;
        }

        Orgao secretaria = macroprocesso.getSecretaria();

        if ( secretaria == null ) {

            return null;
        }

        String sigla = secretaria.getSigla();

        if ( sigla == null ) {

            return null;
        }

        return sigla;
    }

    private Long macroprocessoSecretariaId(Macroprocesso macroprocesso) {

        if ( macroprocesso == null ) {

            return null;
        }

        Orgao secretaria = macroprocesso.getSecretaria();

        if ( secretaria == null ) {

            return null;
        }

        Long id = secretaria.getId();

        if ( id == null ) {

            return null;
        }

        return id;
    }
}

