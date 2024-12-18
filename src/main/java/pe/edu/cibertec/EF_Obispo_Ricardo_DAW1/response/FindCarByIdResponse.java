package pe.edu.cibertec.EF_Obispo_Ricardo_DAW1.response;

import pe.edu.cibertec.EF_Obispo_Ricardo_DAW1.dto.CarDetailDto;

public record FindCarByIdResponse(String code,
                                  String error,
                                  CarDetailDto car) {
}
