package kr.co.gdu.cash.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import kr.co.gdu.cash.service.CashbookService;
import kr.co.gdu.cash.vo.Cashbook;

@Controller
public class ExcelCashbookController {
	@GetMapping(path= "/admin/cashbookListExcel", produces = "application/vnd.ms-excel")
	public String cashbookListExcel() {
		return "cashbookExcelView";
	}
}

@Component("cashbookExcelView")
@Scope("prototype") // 컴포넌트타입의 스코프의 디폴트값은 "singleton"
class CashbookExcelView extends AbstractXlsView{
	@Autowired CashbookService cashbookService;
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setHeader("Content-Disposition","attachment;filename=\"cashbook.xls\"");
		List<Cashbook> cashbookList =cashbookService.getCashbookListAll();
		Sheet sheet = workbook.createSheet();
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("cashbook_id");
		titleRow.createCell(1).setCellValue("cashbook_kind");
		titleRow.createCell(2).setCellValue("category_name");
		titleRow.createCell(3).setCellValue("cashbook_price");
		titleRow.createCell(4).setCellValue("cashbook_content");
		titleRow.createCell(5).setCellValue("cashbook_date");
		titleRow.createCell(6).setCellValue("create_date");
		titleRow.createCell(7).setCellValue("update_date");
		
		for(int i=1; i<cashbookList.size(); i++) {
			Row row = sheet.createRow(i);
			row.createCell(0).setCellValue(cashbookList.get(i).getCashbookId());
			row.createCell(1).setCellValue(cashbookList.get(i).getCashbookKind());
			row.createCell(2).setCellValue(cashbookList.get(i).getCategoryName());
			row.createCell(3).setCellValue(cashbookList.get(i).getCashbookPrice());
			row.createCell(4).setCellValue(cashbookList.get(i).getCashbookContent());
			row.createCell(5).setCellValue(cashbookList.get(i).getCashbookDate());
			row.createCell(6).setCellValue(cashbookList.get(i).getCreateDate());
			row.createCell(7).setCellValue(cashbookList.get(i).getUpdateDate());
		}
	}
}









