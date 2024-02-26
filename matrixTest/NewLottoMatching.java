//package matrixTest;
//
//public class NewLottoMatching {
//    public static void main(String[] args) {
//        IBuyLotto buy = new BuyLotto();
//        ILottoDraw draw = new LottoDraw();
//        ILottoMatch match = new LottoMatch();
//
//        // 로또 구입
//        int[] arr = new int[6];
//        arr = draw.createArrayWithoutDuplicates(arr);
//        arr = draw.sortAscending(arr);
//        draw.printLotto(arr);
//        // 구입한 로또와 추첨한 로또의 일치여부 체크
//    }
//}
//interface IBuyLotto{ int[] buyLotto();}
//interface ILottoDraw{
//    int createRandomNumber(int start, int end);
//    int[] createArrayWithoutDuplicates(int[] arr);
//    int[] sortAscending(int[] arr);
//    void printLotto(int[] arr);
//}
//interface ILottoMatch{
//    int findSame(int[] originLotto, int[] myLotto);
//    String rank(int count);
//}
//class BuyLotto implements IBuyLotto{
//
//    @Override
//    public int[] buyLotto() {
//        return new int[0];
//    }
//}
//class LottoDraw implements ILottoDraw{
//
//    @Override
//    public void printLotto(int[] arr) {
//        for(int i =0; i< arr.length; i++){
//            System.out.printf("%d \t", arr[i]);
//        }
//    }
//
//    @Override
//    public int[] sortAscending(int[] arr) {
//        // 버블 정렬이 들어갈 부분
//        for(int i=0; i< arr.length;i++){
//            for(int j=0; j < arr.length -1; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        return arr;
//    }
//
//    @Override
//    public int[] createArrayWithoutDuplicates(int[] arr) {
//        for(int i=0; i<6; i++){
//            int randomNumber = createRandomNumber(1,45);
//            boolean check = false;
//            for(int j=0; j<6; j++){
//                if(arr[j] == randomNumber){
//                    // 중복되면  check 를 true 로 바꿔라..
//                    check = true;
//                }
//            }
//            if(check==false){
//                arr[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
//            }else{
//                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
//            }
//
//        }
//        return arr;
//    }
//
//    @Override
//    public int createRandomNumber(int start, int end) {
//        Random random = new Random();
//        return random.nextInt(end)+start;
//    }
//
//}
//class LottoMatch implements ILottoMatch{
//    @Override
//    public int findSame(int[] originLotto, int[] myLotto){
//        return 0;
//    }
//
//    @Override
//    public String rank(int count) {
//        return null;
//    }
//
//}
//}
