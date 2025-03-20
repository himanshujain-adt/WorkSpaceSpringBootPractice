package co.alpha.ctl;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.alpha.common.BaseCtl;
import co.alpha.common.ORSResponse;
import co.alpha.dto.UserDTO;
import co.alpha.form.UserForm;
import co.alpha.service.UserServiceInt;

@RestController
@RequestMapping(value ="User")
public class UserCtl extends BaseCtl<UserForm, UserDTO, UserServiceInt> {

	@PostMapping("save")
	public ORSResponse save(@RequestBody @Valid UserForm form, BindingResult bindingResult) {
		
		System.out.println("USERCTL===>>>>>");
		ORSResponse res = validate(bindingResult);
		if (!res.isSuccess()) {
			return res;
		}
		UserDTO dto = (UserDTO) form.getDTO();
		if (dto.getId() != null && dto.getId() > 0) {
			baseService.update(dto);
			res.addMessage("Data Updated....");
			res.addData(dto.getId());
		} else {
			Long id = baseService.add(dto);
			res.addMessage("Data save successfully");
			res.addData(id);
		}
		System.out.println("save method calling");
		return res;
	}

}
