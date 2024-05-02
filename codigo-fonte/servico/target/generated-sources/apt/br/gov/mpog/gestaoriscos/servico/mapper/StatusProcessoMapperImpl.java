package br.gov.mpog.gestaoriscos.servico.mapper;

import br.gov.mpog.gestaoriscos.modelo.StatusProcesso;

import br.gov.mpog.gestaoriscos.modelo.dto.StatusProcessoDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-04-14T10:22:18-0300",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"

)

@Component

public class StatusProcessoMapperImpl implements StatusProcessoMapper {

    @Override

    public StatusProcessoDTO statusProcessoToStatusProcessoDTO(StatusProcesso statusProcesso) {

        if ( statusProcesso == null ) {

            return null;
        }

        StatusProcessoDTO statusProcessoDTO = new StatusProcessoDTO();

        statusProcessoDTO.setId( statusProcesso.getId() );

        statusProcessoDTO.setExcluido( statusProcesso.isExcluido() );

        statusProcessoDTO.setNome( statusProcesso.getNome() );

        return statusProcessoDTO;
    }

    @Override

    public List<StatusProcessoDTO> statusProcessosToStatusProcessoDTOs(List<StatusProcesso> statusProcessos) {

        if ( statusProcessos == null ) {

            return null;
        }

        List<StatusProcessoDTO> list = new ArrayList<StatusProcessoDTO>();

        for ( StatusProcesso statusProcesso : statusProcessos ) {

            list.add( statusProcessoToStatusProcessoDTO( statusProcesso ) );
        }

        return list;
    }

    @Override

    public StatusProcesso statusProcessoDTOToStatusProcesso(StatusProcessoDTO statusProcessoDTO) {

        if ( statusProcessoDTO == null ) {

            return null;
        }

        StatusProcesso statusProcesso = new StatusProcesso();

        statusProcesso.setExcluido( statusProcessoDTO.isExcluido() );

        statusProcesso.setNome( statusProcessoDTO.getNome() );

        statusProcesso.setId( statusProcessoDTO.getId() );

        return statusProcesso;
    }

    @Override

    public List<StatusProcesso> statusProcessoDTOsToStatusProcessos(List<StatusProcessoDTO> statusProcessoDTOs) {

        if ( statusProcessoDTOs == null ) {

            return null;
        }

        List<StatusProcesso> list = new ArrayList<StatusProcesso>();

        for ( StatusProcessoDTO statusProcessoDTO : statusProcessoDTOs ) {

            list.add( statusProcessoDTOToStatusProcesso( statusProcessoDTO ) );
        }

        return list;
    }
}

