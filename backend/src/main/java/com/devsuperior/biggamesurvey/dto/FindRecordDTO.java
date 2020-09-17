package com.devsuperior.biggamesurvey.dto;

import org.springframework.data.domain.Sort;
import java.time.Instant;
import java.util.Arrays;
import static java.lang.String.valueOf;

public class FindRecordDTO {
    private String minDate;
    private String maxDate;
    private String page;
    private String linesPerPage;
    private String orderBy;
    private String direction;

    // Parametros padrão
    public FindRecordDTO() {
        this.minDate = "";
        this.maxDate = "";
        this.page = "";
        this.linesPerPage = "";
        this.orderBy = "id";
        this.direction = "DESC";
    }

    public Instant getMinDate() {
        return !minDate.isEmpty() ? Instant.parse(minDate) : null;
    }

    public void setMinDate(String minDate) {
        this.minDate = minDate;
    }

    public Instant getMaxDate() {
        return !maxDate.isEmpty() ? Instant.parse(maxDate) : null;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }

    public Integer getPage() {
        return page.isEmpty() ? 0 : Integer.valueOf(page);
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Integer getLinesPerPage() {
        return valueOf(linesPerPage).isEmpty() ? Integer.MAX_VALUE : Integer.valueOf(linesPerPage);
    }

    public void setLinesPerPage(String linesPerPage) {
        this.linesPerPage = linesPerPage;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        String[] types = {"id", "name", "age", "moment"};
        if (Arrays.stream(types).anyMatch((type) -> type.equalsIgnoreCase(orderBy)))
            this.orderBy = orderBy;
    }

    public Sort.Direction getDirection() {
        return Sort.Direction.valueOf(direction);
    }

    public void setDirection(String direction) {
        if(direction.equalsIgnoreCase("DESC") || direction.equalsIgnoreCase("ASC") )
            this.direction = direction;
    }

}
