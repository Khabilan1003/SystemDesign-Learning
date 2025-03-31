package State;

import Objects.Coin;
import Objects.Item;
import Objects.VendingMachine;

import java.util.List;

public class SelectionStateImpl implements State{
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you cannot click on insert coin button in selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you cannot insert coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        Item item = vendingMachine.getInventory().getItem(codeNumber);

        int paidByUser = 0;
        for(Coin coin : vendingMachine.getCoinList()) {
            paidByUser = paidByUser + coin.value;
        }

        if(paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, product you selected is for price: " + item.getPrice() + " and you paid " + paidByUser);
            refundFullMoney(vendingMachine);
            throw new Exception("Insufficient Amount");
        }else {
            if(paidByUser > item.getPrice()) returnChange(paidByUser - item.getPrice());
            vendingMachine.setVendingMachineState(new DispenseStateImpl(vendingMachine, codeNumber));
        }
    }

    @Override
    public int returnChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned the change in coin dispense tray: " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("Product cannot be dispensed in Selection State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Return the full amount back in the coin dispense tray");
        vendingMachine.setVendingMachineState(new IdleStateImpl());
        return vendingMachine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory cannot be dispensed in Selection State");
    }
}
