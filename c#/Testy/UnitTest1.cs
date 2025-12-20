using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using MathApp;

namespace Testy
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Class1 class1 = new Class1();
            int y = class1.AddTwo(5, 5);
            int x = 11;

            Assert.AreEqual(x, y);
        }
    }
}
