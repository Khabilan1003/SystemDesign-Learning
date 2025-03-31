package State;

import Objects.Coin;
import Objects.Item;
import Objects.VendingMachine;

import java.util.List;

public class DispenseStateImpl implements State{
    VendingMachine vendingMachine;
    int codeNumber;

    public DispenseStateImpl(VendingMachine vendingMachine, int codeNumber) {
        this.vendingMachine = vendingMachine;
        this.codeNumber = codeNumber;
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("click on Insert coin won't work in Dispense State");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("click on Start Selection Product Button won't work in Dispense State");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Insert coin won't work in Dispense State");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("Choose Product won't work in Dispense State");
    }

    @Override
    public int returnChange(int returnChangeMoney) throws Exception {
        throw new Exception("Return Change won't work in Dispense State");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = vendingMachine.getInventory().getItem(codeNumber);
        vendingMachine.getInventory().updateSoldOutItem(codeNumber);
        vendingMachine.setVendingMachineState(new IdleStateImpl());
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Refund cannot happen in Dispense State");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory cannot be dispensed in Dispense State");
    }
}
