package vds.service.http;

import vds.dto.deposit.DepositFromMobileRequest;
import vds.dto.transfer.MoneyByUserIDRequest;
import vds.spi.IUserAccountService;
import vds.dto.request.*;
import vds.dto.output.DepositResponse;
import vds.dto.output.TransferMoneyResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="users/account")
@Api(tags="UserAccount")
public class UserAccountController {
    private IUserAccountService _userAccountService;

    public UserAccountController(IUserAccountService userAccountService) { this._userAccountService = userAccountService; }

    @ApiOperation(value = "Register Account ", tags = "UserAccount")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK")})
    @RequestMapping(value = "register",method = RequestMethod.POST, consumes={"application/json"})
    public Error RegisterAccount(@RequestBody RegisterAccountRequest request) {
        return _userAccountService.RegisterAccount(request);
    }

    @ApiOperation(value = "Active Account ", tags = "UserAccount")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK")})
    @RequestMapping(value = "active",method = RequestMethod.POST, consumes={"application/json"})
    public Error ActiveAccount(@RequestBody ActiveAccountRequest request) {
        return _userAccountService.ActiveAccount(request);
    }

    @ApiOperation(value = "Transfer Account By UserID", tags = "UserAccount")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK")})
    @RequestMapping(value = "transfer/id", method = RequestMethod.POST, consumes={"application/json"})
    public TransferMoneyResponse TransferMoneyByUserID(@RequestBody MoneyByUserIDRequest request) {
        //Get current User from token
        int currentUser = 2;
        return _userAccountService.TransferMoneyByUserID(currentUser, request);
    }

    @ApiOperation(value = "Transfer Account By Mobile Number", tags = "UserAccount")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK")})
    @RequestMapping(value = "transfer/mobile", method = RequestMethod.POST, consumes={"application/json"})
    public TransferMoneyResponse TransferMoneyByMobileNumber(@RequestBody TransferMoneyByMobileNumberRequest request) {
        //Get current User from token
        int currentUser = 2;
        return _userAccountService.TransferMoneyByMobileNumber(currentUser, request);
    }

    @ApiOperation(value = "Deposit Account By Bank transfer", tags = "UserAccount")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK")})
    @RequestMapping(value = "deposit/mobile", method = RequestMethod.POST, consumes={"application/json"})
    public DepositResponse DepositFromBank(@RequestBody DepositFromBankRequest request) {
        //Get current User from token
        int currentUser = 2;
        return _userAccountService.DepositFromBank(currentUser, request);
    }

    @ApiOperation(value = "Deposit Account By Mobile Card", tags = "UserAccount")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK")})
    @RequestMapping(value = "deposit/mobile", method = RequestMethod.POST, consumes={"application/json"})
    public DepositResponse DepositFromMobileCard(@RequestBody DepositFromMobileRequest request) {
        //Get current User from token
        int currentUser = 2;
        return _userAccountService.DepositFromMobileCard(currentUser, request);
    }




}
